create database worldCup;

CREATE TABLE teams (
    team_id INT,
    team_name VARCHAR(20),
    captain VARCHAR(25),
    runs INT,
    matches_played INT,
    matches_won INT,
    PRIMARY KEY (team_id)
);

CREATE TABLE players (
    jersey_no INT,
    player_name VARCHAR(50),
    player_type VARCHAR(20),
    team_id INT,
    PRIMARY KEY (jersey_no)
);

create table batsman(
jersey_no int,
runs int,
team_name varchar(20),
balls_played int
);

create table bowler(
jersey_no int,
wickets int,
balls int
);

create table matches(
match_id int,
team_1 int,
team_2 int,
won int,
primary key(match_id)
);

create table wickets(
wick_id int,
taken_by int,
taken_of int,
primary key(wick_id)
);

-- a) Create sample data in all the tables.

insert into teams values(1,'team1',101,1001,8,4);
insert into teams values(2,'team2',201,1200,8,4);
insert into teams values(3,'team3',301,1100,8,4);
insert into teams values(4,'team4',401,1900,8,4);
insert into teams values(5,'team5',501,1400,8,4);
insert into teams values(6,'team6',601,3000,8,4);
insert into teams values(7,'team7',701,2200,8,4);
insert into teams values(8,'team8',801,1800,8,4);

-- select * from players;

insert into players values(101,'t1p1','batsman',1);
insert into players values(102,'t1p2','bowler',1);

insert into players values(201,'t2p1','batsman',2);
insert into players values(202,'t2p2','bowler',2);

insert into players values(301,'t3p1','batsman',3);
insert into players values(302,'t3p2','bowler',3);

insert into players values(401,'t4p1','batsman',4);
insert into players values(402,'t4p2','bowler',4);

insert into players values(501,'t5p1','batsman',5);
insert into players values(502,'t5p2','bowler',5);

insert into players values(601,'t6p1','batsman',6);
insert into players values(602,'t6p2','bowler',6);

insert into players values(701,'t7p1','batsman',7);
insert into players values(702,'t7p2','bowler',7);

insert into players values(801,'t8p1','batsman',8);
insert into players values(802,'t8p2','bowler',8);

-- select * from players;

insert into batsman values(101,234,'team1',59);
insert into batsman values(201,109,'team2',59);
insert into batsman values(301,24,'team3',59);
insert into batsman values(401,294,'team4',59);
insert into batsman values(501,43,'team5',59);
insert into batsman values(601,274,'team6',59);
insert into batsman values(701,134,'team7',59);
insert into batsman values(801,0,'team8',59);

-- select * from batsman;

insert into bowler values(102,2,59);
insert into bowler values(202,9,59);
insert into bowler values(302,4,59);
insert into bowler values(402,3,59);
insert into bowler values(502,13,59);
insert into bowler values(602,21,59);
insert into bowler values(702,14,59);
insert into bowler values(802,12,59);

-- select * from bowler;

insert into matches values(1,1,2,1);
insert into matches values(2,3,4,4);
insert into matches values(3,5,6,5);
insert into matches values(4,7,8,8);

-- select * from matches;

insert into wickets values(1,102,801);
insert into wickets values(2,202,701);
insert into wickets values(3,302,601);
insert into wickets values(4,402,501);

-- select * from wickets;

-- b) Fetch the top 5 batsmen who scored the maximum runs.

select * from batsman order by runs desc limit 5;

-- c) Fetch the top 5 bowlers who has taken the maximum wickets.

select * from bowler order by wickets desc limit 5;

-- d) Fetch the average score scored by each team considering the matches played.

select team_name, runs/matches_played from teams order by runs/matches_played desc;

-- e) Increase the scores of each batsmen in the team, which has the least average computed in Step 6, by 10 runs.

select * from batsman;
UPDATE batsman 
SET 
    runs = runs+10
WHERE
	(select team_name from teams order by runs/matches_played asc limit 1);

-- f) Create a procedure which takes country as the input and gives the highest score of the country up to date, as output


DELIMITER $$
drop procedure if exists highest$$
create procedure highest(input varchar(50), out run int)
begin
	select max(runs) into run from teams where team_name = input;
end$$

DELIMITER ;

call highest('team1',@run);
select @highestScore;



