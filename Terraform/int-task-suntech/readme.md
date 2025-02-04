<!-- TOC -->

- [Introduction](#introduction)
  - [Initial tools](#initial-tools)
- [Official documentation](#official-documentation)
  - [Terraform Language Documentation](#terraform-language-documentation)
  - [Terraform CLI Documentation](#terraform-cli-documentation)
  - [Providers: on AWS example](#providers-on-aws-example)
- [Requirements](#requirements)
- [How to use cf2tf](#how-to-use-cf2tf)
- [Brainboard](#brainboard)
- [Architecture](#architecture)
  - [Terraform code](#terraform-code)

<!-- /TOC -->

# Introduction

As a initial step: complexity of task was checked, namely translation from YAML format (**CloudFormation**) to `.tf` file (**Terraform**).

Oryginal CloudFormation code link:

> https://arcgisstore.s3.us-east-1.amazonaws.com/110/templates/arcgis-server-ha.template.json

Oryginal architecture description

> https://enterprise.arcgis.com/en/server/latest/cloud/amazon/cf-arcgis-server-ha.htm

As cf2tf tool is under developement, that means it is not perfect.

Moreover oryginal scripts, commands from CloudFromation were removed as main tasks are:

- estimate costs
- propose entry point for ifrastructure

## Initial tools

- Python

> https://www.python.org/

- cf2tf

> https://github.com/DontShaveTheYak/cf2tf

# Official documentation

## Terraform Language Documentation

- https://developer.hashicorp.com/terraform/language

## Terraform CLI Documentation

- https://developer.hashicorp.com/terraform/cli

## Providers: on AWS example

- https://registry.terraform.io/providers/hashicorp/aws/latest/docs

# Requirements

> Python >= 3.7

> cf2tf >= 0.5.0

# How to use cf2tf

Open terminal session in directory where `.yaml` file is located and next execute

> 'cf2tf my_template.yaml > main.tf'

Assumption here is only that cf2tf is already installed

# Brainboard

Interesting new tool which support preparing ifrastructure for cloud deployments. This is UI tool, but with git support as well as CICD approach.

What is also adventage of that tool: it's support different environment versions like PROD, STAGE, DEV

> https://www.brainboard.co/

Medium article

> https://medium.com/@mike_tyson_cloud/no-one-should-ever-write-a-single-line-of-terrafom-code-5488d95211a8

# Architecture

Base on brainboard platform initial architecture diagram was prapared and can be reached under following path:

> Terraform/int-task-suntech/Brainboard-arch.png

Next step was prepare something like template for further improvements.

## Terraform code

Terraform file was prepared and could be found under followig path

> Terraform/int-task-suntech/brainboard-terra.tf

