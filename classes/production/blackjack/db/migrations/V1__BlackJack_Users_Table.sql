CREATE TABLE `users` (
`id`                  int(11)       NOT NULL    AUTO_INCREMENT,
`balance`             float         NOT NULL    DEFAULT '0',
`version`             int(11)       NOT NULL    DEFAULT '0',
`modified`            timestamp     NOT NULL    DEFAULT CURRENT_TIMESTAMP,
`created`             timestamp     NOT NULL    DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;