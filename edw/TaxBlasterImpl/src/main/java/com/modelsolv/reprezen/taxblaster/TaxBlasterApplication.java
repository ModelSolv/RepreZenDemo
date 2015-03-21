package com.modelsolv.reprezen.taxblaster;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.modelsolv.reprezen.resources.taxblasterinterface.PersonObjectResource;
import com.modelsolv.reprezen.resources.taxblasterinterface.TaxFilingObjectResource;
import com.modelsolv.reprezen.taxblaster.dao.PersonDAO;
import com.modelsolv.reprezen.taxblaster.dao.PersonImpl;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingDAO;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingImpl;
import com.modelsolv.reprezentaxblaster.resources.impl.PersonCollectionResourceImpl;
import com.modelsolv.reprezentaxblaster.resources.impl.PersonObjectResourceImpl;
import com.modelsolv.reprezentaxblaster.resources.impl.TaxFilingCollectionResourceImpl;
import com.modelsolv.reprezentaxblaster.resources.impl.TaxFilingObjectResourceImpl;

public class TaxBlasterApplication extends Application<TaxBlasterConfiguration> {
	public static void main(String[] args) throws Exception {
		new TaxBlasterApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<TaxBlasterConfiguration> bootstrap) {
		bootstrap.addBundle(new MigrationsBundle<TaxBlasterConfiguration>() {

			public DataSourceFactory getDataSourceFactory(
					TaxBlasterConfiguration configuration) {
				return configuration.getDataSourceFactory();
			}

		});
		bootstrap.addBundle(hibernate);
	}

	@Override
	public void run(TaxBlasterConfiguration configuration,
			Environment environment) {
		final PersonDAO personDao = new PersonDAO(hibernate.getSessionFactory());
		final PersonObjectResource personObjectResource = new PersonObjectResourceImpl(
				personDao);
		final PersonCollectionResourceImpl personCollectionResource = new PersonCollectionResourceImpl(
				personDao);
		environment.jersey().register(personObjectResource);
		environment.jersey().register(personCollectionResource);

		final TaxFilingDAO taxfilingDAO = new TaxFilingDAO(
				hibernate.getSessionFactory());
		final TaxFilingObjectResource taxFilingResource = new TaxFilingObjectResourceImpl(
				taxfilingDAO);
		final TaxFilingCollectionResourceImpl taxFilingCollectionResource = new TaxFilingCollectionResourceImpl(
				taxfilingDAO, personDao);
		environment.jersey().register(taxFilingResource);
		environment.jersey().register(taxFilingCollectionResource);
	}

	private final HibernateBundle<TaxBlasterConfiguration> hibernate = new HibernateBundle<TaxBlasterConfiguration>(
			PersonImpl.class, TaxFilingImpl.class) {

		public DataSourceFactory getDataSourceFactory(
				TaxBlasterConfiguration configuration) {
			return configuration.getDataSourceFactory();
		}

	};

}