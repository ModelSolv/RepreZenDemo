
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndexObject_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "indexObject");
    private final static QName _PersonObject_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "personObject");
    private final static QName _TaxFilingCollection_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "taxFilingCollection");
    private final static QName _PersonTaxFilingCollection_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "personTaxFilingCollection");
    private final static QName _PersonCollection_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "personCollection");
    private final static QName _TaxFilingObject_QNAME = new QName("http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", "taxFilingObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link TaxFilingCollectionTaxpayer }
     * 
     */
    public TaxFilingCollectionTaxpayer createTaxFilingCollectionTaxpayer() {
        return new TaxFilingCollectionTaxpayer();
    }

    /**
     * Create an instance of {@link PersonObject }
     * 
     */
    public PersonObject createPersonObject() {
        return new PersonObject();
    }

    /**
     * Create an instance of {@link PersonObject.TaxFilingsList }
     * 
     */
    public PersonObject.TaxFilingsList createPersonObjectTaxFilingsList() {
        return new PersonObject.TaxFilingsList();
    }

    /**
     * Create an instance of {@link IndexObject }
     * 
     */
    public IndexObject createIndexObject() {
        return new IndexObject();
    }

    /**
     * Create an instance of {@link IndexObject.TaxFilingsList }
     * 
     */
    public IndexObject.TaxFilingsList createIndexObjectTaxFilingsList() {
        return new IndexObject.TaxFilingsList();
    }

    /**
     * Create an instance of {@link IndexObject.PeopleList }
     * 
     */
    public IndexObject.PeopleList createIndexObjectPeopleList() {
        return new IndexObject.PeopleList();
    }

    /**
     * Create an instance of {@link PersonTaxFilingCollection }
     * 
     */
    public PersonTaxFilingCollection createPersonTaxFilingCollection() {
        return new PersonTaxFilingCollection();
    }

    /**
     * Create an instance of {@link TaxFilingCollection }
     * 
     */
    public TaxFilingCollection createTaxFilingCollection() {
        return new TaxFilingCollection();
    }

    /**
     * Create an instance of {@link PersonCollection }
     * 
     */
    public PersonCollection createPersonCollection() {
        return new PersonCollection();
    }

    /**
     * Create an instance of {@link PersonCollection.PersonCollectionItem }
     * 
     */
    public PersonCollection.PersonCollectionItem createPersonCollectionPersonCollectionItem() {
        return new PersonCollection.PersonCollectionItem();
    }

    /**
     * Create an instance of {@link PersonCollection.PersonCollectionItem.TaxFilingsList }
     * 
     */
    public PersonCollection.PersonCollectionItem.TaxFilingsList createPersonCollectionPersonCollectionItemTaxFilingsList() {
        return new PersonCollection.PersonCollectionItem.TaxFilingsList();
    }

    /**
     * Create an instance of {@link TaxFilingObject }
     * 
     */
    public TaxFilingObject createTaxFilingObject() {
        return new TaxFilingObject();
    }

    /**
     * Create an instance of {@link TaxFilingCollectionTaxpayerAddresses }
     * 
     */
    public TaxFilingCollectionTaxpayerAddresses createTaxFilingCollectionTaxpayerAddresses() {
        return new TaxFilingCollectionTaxpayerAddresses();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link PersonObjectAddresses }
     * 
     */
    public PersonObjectAddresses createPersonObjectAddresses() {
        return new PersonObjectAddresses();
    }

    /**
     * Create an instance of {@link PersonTaxFilingCollectionTaxFilings }
     * 
     */
    public PersonTaxFilingCollectionTaxFilings createPersonTaxFilingCollectionTaxFilings() {
        return new PersonTaxFilingCollectionTaxFilings();
    }

    /**
     * Create an instance of {@link PersonCollectionAddresses }
     * 
     */
    public PersonCollectionAddresses createPersonCollectionAddresses() {
        return new PersonCollectionAddresses();
    }

    /**
     * Create an instance of {@link Person.OtherNamesList }
     * 
     */
    public Person.OtherNamesList createPersonOtherNamesList() {
        return new Person.OtherNamesList();
    }

    /**
     * Create an instance of {@link TaxFilingCollectionTaxpayer.OtherNamesList }
     * 
     */
    public TaxFilingCollectionTaxpayer.OtherNamesList createTaxFilingCollectionTaxpayerOtherNamesList() {
        return new TaxFilingCollectionTaxpayer.OtherNamesList();
    }

    /**
     * Create an instance of {@link TaxFilingCollectionTaxpayer.AddressesList }
     * 
     */
    public TaxFilingCollectionTaxpayer.AddressesList createTaxFilingCollectionTaxpayerAddressesList() {
        return new TaxFilingCollectionTaxpayer.AddressesList();
    }

    /**
     * Create an instance of {@link PersonObject.OtherNamesList }
     * 
     */
    public PersonObject.OtherNamesList createPersonObjectOtherNamesList() {
        return new PersonObject.OtherNamesList();
    }

    /**
     * Create an instance of {@link PersonObject.AddressesList }
     * 
     */
    public PersonObject.AddressesList createPersonObjectAddressesList() {
        return new PersonObject.AddressesList();
    }

    /**
     * Create an instance of {@link PersonObject.TaxFilingsList.TaxFilings }
     * 
     */
    public PersonObject.TaxFilingsList.TaxFilings createPersonObjectTaxFilingsListTaxFilings() {
        return new PersonObject.TaxFilingsList.TaxFilings();
    }

    /**
     * Create an instance of {@link IndexObject.TaxFilingsList.TaxFilings }
     * 
     */
    public IndexObject.TaxFilingsList.TaxFilings createIndexObjectTaxFilingsListTaxFilings() {
        return new IndexObject.TaxFilingsList.TaxFilings();
    }

    /**
     * Create an instance of {@link IndexObject.PeopleList.People }
     * 
     */
    public IndexObject.PeopleList.People createIndexObjectPeopleListPeople() {
        return new IndexObject.PeopleList.People();
    }

    /**
     * Create an instance of {@link PersonTaxFilingCollection.TaxFilingsList }
     * 
     */
    public PersonTaxFilingCollection.TaxFilingsList createPersonTaxFilingCollectionTaxFilingsList() {
        return new PersonTaxFilingCollection.TaxFilingsList();
    }

    /**
     * Create an instance of {@link TaxFilingCollection.TaxFilingCollectionItem }
     * 
     */
    public TaxFilingCollection.TaxFilingCollectionItem createTaxFilingCollectionTaxFilingCollectionItem() {
        return new TaxFilingCollection.TaxFilingCollectionItem();
    }

    /**
     * Create an instance of {@link PersonCollection.PersonCollectionItem.OtherNamesList }
     * 
     */
    public PersonCollection.PersonCollectionItem.OtherNamesList createPersonCollectionPersonCollectionItemOtherNamesList() {
        return new PersonCollection.PersonCollectionItem.OtherNamesList();
    }

    /**
     * Create an instance of {@link PersonCollection.PersonCollectionItem.AddressesList }
     * 
     */
    public PersonCollection.PersonCollectionItem.AddressesList createPersonCollectionPersonCollectionItemAddressesList() {
        return new PersonCollection.PersonCollectionItem.AddressesList();
    }

    /**
     * Create an instance of {@link PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings }
     * 
     */
    public PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings createPersonCollectionPersonCollectionItemTaxFilingsListTaxFilings() {
        return new PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings();
    }

    /**
     * Create an instance of {@link TaxFilingObject.Taxpayer }
     * 
     */
    public TaxFilingObject.Taxpayer createTaxFilingObjectTaxpayer() {
        return new TaxFilingObject.Taxpayer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "indexObject")
    public JAXBElement<IndexObject> createIndexObject(IndexObject value) {
        return new JAXBElement<IndexObject>(_IndexObject_QNAME, IndexObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "personObject")
    public JAXBElement<PersonObject> createPersonObject(PersonObject value) {
        return new JAXBElement<PersonObject>(_PersonObject_QNAME, PersonObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFilingCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "taxFilingCollection")
    public JAXBElement<TaxFilingCollection> createTaxFilingCollection(TaxFilingCollection value) {
        return new JAXBElement<TaxFilingCollection>(_TaxFilingCollection_QNAME, TaxFilingCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonTaxFilingCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "personTaxFilingCollection")
    public JAXBElement<PersonTaxFilingCollection> createPersonTaxFilingCollection(PersonTaxFilingCollection value) {
        return new JAXBElement<PersonTaxFilingCollection>(_PersonTaxFilingCollection_QNAME, PersonTaxFilingCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "personCollection")
    public JAXBElement<PersonCollection> createPersonCollection(PersonCollection value) {
        return new JAXBElement<PersonCollection>(_PersonCollection_QNAME, PersonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFilingObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface", name = "taxFilingObject")
    public JAXBElement<TaxFilingObject> createTaxFilingObject(TaxFilingObject value) {
        return new JAXBElement<TaxFilingObject>(_TaxFilingObject_QNAME, TaxFilingObject.class, null, value);
    }

}
