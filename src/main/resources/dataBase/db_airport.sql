create schema airport;

create table airport.personal(
id int not null primary key auto_increment,
name varchar(255) not null,
surname varchar(255) not null);

create table airport.airplane(
id int not null primary key auto_increment,
name varchar(255) not null,
passenger_capacity int not null);

create table airport.department(
id int not null primary key auto_increment,
name varchar(255) not null);

create table airport.location_city(
id int not null primary key auto_increment,
name varchar(255) not null,
country_id int not null);

create table airport.location_country(
id int not null primary key auto_increment,
name varchar(255) not null);

create table airport.personal_job_title(
id int not null primary key auto_increment,
personal_id int not null,
job_title_id int not null,
flight_id int);


create table airport.flight(
id int not null primary key auto_increment,
airplane_id int not null,
route_id int not null,
date date not null,
departure_time time not null,
arrival_time time not null);

create table airport.passenger(
id int not null primary key auto_increment,
name varchar(255) not null,
surname varchar(255) not null,
passport_number int not null,
e_mail varchar(255) not null,
user_id int);

create table airport.job_title(
id int not null primary key auto_increment,
title varchar (255) not null,
department_id int not null);

create table airport.route(
id int not null primary key auto_increment,
departure_city_id int not null,
arrival_city_id int not null);

create table airport.ticket(
id int not null primary key auto_increment,
place_number int not null,
passenger_id int,
ticket_price_id int not null);

create table airport.ticket_class(
id int not null primary key auto_increment,
name varchar(255) not null);

create table airport.ticket_price(
id int not null primary key auto_increment,
flight_id int not null,
ticket_class_id int not null,
ticket_price double not null);

create table airport.user(
id int not null primary key auto_increment,
name varchar(255) not null,
e_mail varchar(255) not null,
user_credentials_id int not null);

create table airport.user_credentials(
id int not null primary key auto_increment,
login varchar(255) not null,
password varchar(255) not null);
