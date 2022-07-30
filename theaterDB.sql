// location
INSERT INTO Location VALUES
('West Oak', '75201'),
('North Star', '75201'),
('Old Bridge', '75201'),
('Raspberry Lane', '75080'),
('South Shore', '75080'),
('Robin Street', '75080'),
('Truce Road', '75051'),
('East Bay', '75051'),
('Huckleberry Street', '75051');


// movie
INSERT INTO Movie VALUES 
('Minions the Rise of Gru'),
('Elvis'),
('The Deer King'),
('The Black Phone'),
('Thor Love and Thunder'),
('RRR'),
 ('Where the Crawdads Sing'),
('Top Gun Maverick'),
('Lightyear'),
('Cabaret'),
('Sing 2'),
('Tom and Jerry'),
('The Gray Man'),
('Kaduva'),
('Official Competition'),
('London Nahi Jaunga'),
('Everything Everywhere All at Once'),
('Jurassic World Dominion');    


// movie showing

// squence: (showtime, theaterLocation, movieName)
INSERT INTO MovieShowing VALUES 
('07:00 PM', 'West Oak', 'Minions the Rise of Gru'),
('08:00 PM', 'West Oak', 'Minions the Rise of Gru'),
('09:00 PM', 'West Oak', 'Minions the Rise of Gru'),
('09:00 PM','West Oak', 'Elvis'),
('10:00 PM','West Oak', 'Elvis'),
('11:00 PM','West Oak', 'Elvis'),
('06:00 PM', 'West Oak', 'The Deer King'),
('07:00 PM', 'West Oak', 'The Deer King'),
('09:00 PM', 'West Oak', 'The Deer King'),
('10:30 PM', 'North Star', 'The Black Phone'),
('11:00 PM', 'North Star', 'The Black Phone'),
('12:00 AM', 'North Star', 'The Black Phone'),
('05:00 PM', 'North Star', 'Thor: Love and Thunder'),
('06:00 PM', 'North Star', 'Thor: Love and Thunder'),
('11:00 PM', 'North Star', 'Thor: Love and Thunder'),
('09:00 PM', 'North Star', 'RRR'),
('12:00 AM', 'North Star', 'RRR'),
('01:00 AM', 'North Star', 'RRR'),
('12:00 PM','Old Bridge','Where the Crawdads Sing'),
('04:00 PM','Old Bridge','Where the Crawdads Sing'),
('05:00 PM','Old Bridge','Where the Crawdads Sing'),
('07:00 PM', 'Old Bridge', 'Top Gun Maverick'),
('10:00 PM', 'Old Bridge', 'Top Gun Maverick'),
('11:30 PM', 'Old Bridge', 'Top Gun Maverick'),
('02:00 PM', 'Old Bridge', 'Lightyear'),
('03:00 PM', 'Old Bridge', 'Lightyear'),
('07:00 PM', 'Old Bridge', 'Lightyear'),
('10:00 AM', 'Raspberry Lane', 'Cabaret'),
('11:00 AM', 'Raspberry Lane', 'Cabaret'),
('06:00 PM', 'Raspberry Lane', 'Cabaret'),
('10:00 AM', 'Raspberry Lane', 'The Deer King'),
('12:30 PM', 'Raspberry Lane', 'The Deer King'),
('05:00 PM', 'Raspberry Lane', 'The Deer King'),
('10:00 AM', 'Raspberry Lane', 'Sing2'),
('03:00 PM', 'Raspberry Lane', 'Sing2'),
('05:00 PM', 'Raspberry Lane', 'Sing2'),
('02:00 PM', 'South Shore', 'Tom and Jerry'),
('03:00 PM', 'South Shore', 'Tom and Jerry'),
('07:00 PM', 'South Shore', 'Tom and Jerry'),
('12:30 PM', 'South Shore', 'The Gray Man'),
('03:45 PM', 'South Shore', 'The Gray Man'),
('11:30 PM', 'South Shore', 'The Gray Man'),
('08:00 PM', 'South Shore', 'Kaduva'),
('11:00 PM', 'South Shore', 'Kaduva'),
('12:00 PM', 'South Shore', 'Kaduva'),
('02:30 PM', 'Robin Street', 'Official Competition'),
('04:45 PM', 'Robin Street', 'Official Competition'),
('07:00 PM', 'Robin Street', 'Official Competition'),
('11:00 PM', 'Robin Street', 'London Nahi Jaunga'),
('12:00 AM', 'Robin Street', 'London Nahi Jaunga'),
('01:30 AM', 'Robin Street', 'London Nahi Jaunga'),
('01:00 PM', 'Robin Street', 'Everything Everywhere All at Once'),
('04:00 PM', 'Robin Street', 'Everything Everywhere All at Once'),
('08:00 PM', 'Robin Street', 'Everything Everywhere All at Once'),
('02:30 PM', 'Truce Road', 'Minions the Rise of Gru'),
('04:45 PM', 'Truce Road', 'Minions the Rise of Gru'),
('07:00 PM', 'Truce Road', 'Minions the Rise of Gru'),
('07:00 PM', 'Truce Road', 'Kaduva'),
('08:00 PM', 'Truce Road', 'Kaduva'),
('09:00 PM', 'Truce Road', 'Kaduva'),
('09:00 PM', 'Truce Road', 'The Black Phone'),
('12:00 AM', 'Truce Road', 'The Black Phone'),
('01:00 AM', 'Truce Road', 'The Black Phone'),
('03:30 PM', 'East Bay', 'Top Gun Maverick'),
('04:45 PM', 'East Bay', 'Top Gun Maverick'),
('07:00 PM', 'East Bay', 'Top Gun Maverick'),
('09:00 PM', 'East Bay', 'RRR'),
('10:30 PM', 'East Bay', 'RRR'),
('12:00 PM', 'East Bay', 'RRR'),
('10:00 AM', 'East Bay', 'Elvis'),
('11:00 AM', 'East Bay', 'Elvis'),
('06:00 PM', 'East Bay', 'Elvis'),
('06:00 PM', 'Huckleberry Street', 'Thor Love and Thunder'),
('07:30 PM', 'Huckleberry Street', 'Thor Love and Thunder'),
('09:00 PM', 'Huckleberry Street', 'Thor Love and Thunder'),
('03:00 PM', 'Huckleberry Street', 'Jurassic World Dominion'),
('05:30 PM', 'Huckleberry Street', 'Jurassic World Dominion'),
('09:00 PM', 'Huckleberry Street', 'Jurassic World Dominion'),
('05:00 PM','Huckleberry Street','Where the Crawdads Sing'),
('08:00 PM','Huckleberry Street','Where the Crawdads Sing'),
('11:00 PM','Huckleberry Street','Where the Crawdads Sing');


// sequece: (theaterLocation, showtime, movieName)
INSERT INTO MovieShowing VALUES 
('West Oak', '07:00 PM', 'Minions the Rise of Gru'),
('West Oak', '08:00 PM', 'Minions the Rise of Gru'),
('West Oak', '09:00 PM', 'Minions the Rise of Gru'),
('West Oak','09:00 PM', 'Elvis'),
('West Oak','10:00 PM', 'Elvis'),
('West Oak','11:00 PM', 'Elvis'),
('West Oak', '06:00 PM', 'The Deer King'),
('West Oak', '07:00 PM', 'The Deer King'),
('West Oak', '09:00 PM', 'The Deer King'),
('North Star','10:30 PM', 'The Black Phone'),
('North Star','11:00 PM', 'The Black Phone'),
('North Star','12:00 AM', 'The Black Phone'),
('North Star','05:00 PM', 'Thor Love and Thunder'),
('North Star','06:00 PM', 'Thor Love and Thunder'),
('North Star','11:00 PM', 'Thor Love and Thunder'),
('North Star','09:00 PM', 'RRR'),
('North Star','12:00 AM', 'RRR'),
('North Star','01:00 AM', 'RRR'),
('Old Bridge', '12:00 PM','Where the Crawdads Sing'),
('Old Bridge', '04:00 PM','Where the Crawdads Sing'),
('Old Bridge', '05:00 PM','Where the Crawdads Sing'),
('Old Bridge', '07:00 PM', 'Top Gun Maverick'),
('Old Bridge', '10:00 PM', 'Top Gun Maverick'),
('Old Bridge', '11:30 PM', 'Top Gun Maverick'),
('Old Bridge', '02:00 PM', 'Lightyear'),
('Old Bridge', '03:00 PM', 'Lightyear'),
('Old Bridge', '07:00 PM', 'Lightyear'),
('Raspberry Lane', '10:00 AM', 'Cabaret'),
('Raspberry Lane', '11:00 AM', 'Cabaret'),
('Raspberry Lane', '06:00 PM', 'Cabaret'),
('Raspberry Lane','10:00 AM', 'The Deer King'),
('Raspberry Lane','12:30 PM', 'The Deer King'),
('Raspberry Lane','05:00 PM', 'The Deer King'),
('Raspberry Lane','10:00 AM', 'Sing2'),
('Raspberry Lane','03:00 PM', 'Sing2'),
('Raspberry Lane','05:00 PM', 'Sing2'),
('South Shore','02:00 PM', 'Tom and Jerry'),
('South Shore','03:00 PM', 'Tom and Jerry'),
('South Shore','07:00 PM', 'Tom and Jerry'),
('South Shore', '12:30 PM', 'The Gray Man'),
('South Shore', '03:45 PM', 'The Gray Man'),
('South Shore', '11:30 PM', 'The Gray Man'),
('South Shore', '08:00 PM',  'Kaduva'),
('South Shore', '11:00 PM', 'Kaduva'),
('South Shore', '12:00 PM',  'Kaduva'),
('Robin Street','02:30 PM', 'Official Competition'),
('Robin Street','04:45 PM', 'Official Competition'),
('Robin Street','07:00 PM', 'Official Competition'),
('Robin Street', '11:00 PM',  'London Nahi Jaunga'),
('Robin Street', '12:00 AM', 'London Nahi Jaunga'),
('Robin Street', '01:30 AM', 'London Nahi Jaunga'),
('Robin Street','01:00 PM', 'Everything Everywhere All at Once'),
('Robin Street','04:00 PM', 'Everything Everywhere All at Once'),
('Robin Street','08:00 PM', 'Everything Everywhere All at Once'),
('Truce Road','02:30 PM', 'Minions the Rise of Gru'),
('Truce Road','04:45 PM', 'Minions the Rise of Gru'),
('Truce Road','07:00 PM', 'Minions the Rise of Gru'),
('Truce Road','07:00 PM', 'Kaduva'),
('Truce Road','08:00 PM', 'Kaduva'),
('Truce Road','09:00 PM', 'Kaduva'),
('Truce Road','09:00 PM', 'The Black Phone'),
('Truce Road','12:00 AM', 'The Black Phone'),
('Truce Road','01:00 1M', 'The Black Phone'),
('East Bay','03:30 PM', 'Top Gun Maverick'),
('East Bay','04:45 PM', 'Top Gun Maverick'),
('East Bay','07:00 PM', 'Top Gun Maverick'),
('East Bay','09:00 PM', 'RRR'),
('East Bay','10:30 PM', 'RRR'),
('East Bay','12:00 PM', 'RRR'),
('East Bay','10:00 AM', 'Elvis'),
('East Bay','11:00 AM', 'Elvis'),
('East Bay','06:00 PM', 'Elvis'),
('Huckleberry Street','06:00 PM', 'Thor Love and Thunder'),
('Huckleberry Street','07:30 PM', 'Thor Love and Thunder'),
('Huckleberry Street','09:00 PM', 'Thor Love and Thunder'),
('Huckleberry Street','03:00 PM', 'Jurassic World Dominion'),
('Huckleberry Street','05:30 PM', 'Jurassic World Dominion'),
('Huckleberry Street','09:00 PM', 'Jurassic World Dominion'),
('Huckleberry Street','05:00 PM', 'Where the Crawdads Sing'),
('Huckleberry Street','08:00 PM', 'Where the Crawdads Sing'),
('Huckleberry Street','11:00 PM', 'Where the Crawdads Sing');