# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_company primary key (id)
);

create table computer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  introduced                    datetime(6),
  discontinued                  datetime(6),
  company_id                    bigint,
  constraint pk_computer primary key (id)
);

create table crop (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  category                      varchar(255),
  constraint pk_crop primary key (id)
);

create table driver (
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  created_on                    datetime(6),
  constraint pk_driver primary key (id)
);

create table farmer (
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  middle_name                   varchar(255),
  last_name                     varchar(255),
  mobile_number                 integer not null,
  dob                           datetime(6),
  gender                        varchar(255),
  registered_on                 bigint not null,
  constraint pk_farmer primary key (id)
);

create table land (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  latitude                      varchar(255),
  longitude                     varchar(255),
  acres                         integer not null,
  guntha                        integer not null,
  farmer_id                     integer not null,
  soil_type                     integer not null,
  created_on                    bigint not null,
  constraint pk_land primary key (id)
);

create table soil (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_soil primary key (id)
);

create table transaction (
  id                            bigint auto_increment not null,
  farmer_id                     bigint not null,
  user_crop_id                  bigint,
  land_id                       bigint,
  amount                        double not null,
  type                          integer not null,
  reason_id                     bigint not null,
  qty                           double not null,
  duration                      double not null,
  date                          datetime(6),
  constraint pk_transaction primary key (id)
);

create table transaction_reason (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  transaction_level             integer not null,
  constraint pk_transaction_reason primary key (id)
);

create table user_crop (
  id                            bigint auto_increment not null,
  farmer_id                     bigint not null,
  crop_id                       bigint not null,
  land_id                       bigint not null,
  acres                         bigint not null,
  name                          varchar(255),
  status                        varchar(255),
  guntha                        bigint not null,
  start_date                    datetime(6),
  constraint pk_user_crop primary key (id)
);

create index ix_computer_company_id on computer (company_id);
alter table computer add constraint fk_computer_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;


# --- !Downs

alter table computer drop foreign key fk_computer_company_id;
drop index ix_computer_company_id on computer;

drop table if exists company;

drop table if exists computer;

drop table if exists crop;

drop table if exists driver;

drop table if exists farmer;

drop table if exists land;

drop table if exists soil;

drop table if exists transaction;

drop table if exists transaction_reason;

drop table if exists user_crop;

