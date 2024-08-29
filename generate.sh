#!/bin/bash

$1/openapi-generator-cli.jar generate -g java -c config.json -i https://www.imager200.io/imager200.json
