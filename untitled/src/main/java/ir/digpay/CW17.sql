drop table if exists trips, passengers, drivers;

create table passengers
(
    passenger_id serial primary key,
    name         varchar(50),
    user_name    varchar(50),
    phone_number varchar(11),
    password     varchar(20),
    x_location   int,
    y_location   int
);

create table drivers
(
    driver_id    serial primary key,
    name         varchar(50),
    phone_number varchar(11),
    user_name    varchar(50),
    password     varchar(20),
    plate_number varchar(10),
    car_name     varchar(20),
    x_location   int,
    y_location   int
);

create table trips
(
    trip_id        serial primary key,
    x_start        int,
    y_start        int,
    x_end          int,
    y_end          int,
    start_time     TIMESTAMP WITHOUT TIME ZONE,
    end_time       TIMESTAMP WITHOUT TIME ZONE,
    distance       double precision,
    speed          numeric,
    price_per_unit int,
    total_price    double precision,
    driver_id      int references drivers (driver_id),
    passenger_id   int references passengers (passenger_id)
);

insert into passengers
values (1, 'ali', 'ali78', '0937', '123456', 5, 7);
