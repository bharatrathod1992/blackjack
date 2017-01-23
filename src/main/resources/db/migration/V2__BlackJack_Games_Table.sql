CREATE TABLE `games` (
`gameId`          INT                    NOT NULL     AUTO_INCREMENT,
`status`          ENUM('Won', 'Lost')    NOT NULL,
`u_id`            INT                    NOT NULL,
`created`         TIMESTAMP              NOT NULL     DEFAULT NOW(),
`modified`        TIMESTAMP              NOT NULL     DEFAULT NOW(),
`version`         INT                    NOT NULL     DEFAULT 0,
PRIMARY KEY (`gameId`),
INDEX `u_id_idx` (`u_id` ASC),
CONSTRAINT `u_id`
FOREIGN KEY (`u_id`)
REFERENCES `blackjackdev`.`users` (`id`)
ON DELETE NO ACTION
ON UPDATE NO ACTION);