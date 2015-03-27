#! /usr/bin/env bash
echo "
"
echo "STARTING REQUESTS"
echo "Created Person 1:"
curl -H "Content-Type: application/json" -X POST -d '{"firstName":"John","lastName":"Smith"}' http://localhost:8080/people
echo "
"
echo "Created Person 2:"
curl -H "Content-Type: application/json" -X POST -d '{"firstName":"Jack","lastName":"Johnson"}' http://localhost:8080/people
echo "
"
echo "Created TaxFiling for Person 2:"
curl -H "Content-Type: application/json" -X POST -d '{"jurisdiction":"HAW","grossIncome":100.10, "taxpayer":{"taxpayerID":2, "firstName":"Jack"}}' http://localhost:8080/taxfilings
echo "
"
echo "Requested Person 1:"
curl http://localhost:8080/people/1
echo "
"
echo "Requested TaxFiling 1:"
curl http://localhost:8080/taxfilings/1