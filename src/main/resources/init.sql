CREATE SCHEMA `demo` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `demo`.`t_demo` (
  `id` INT NOT NULL,
  `name` CHAR(10) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `demo`.`t_demo` (`id`, `name`) VALUES ('1', 'howieli');
INSERT INTO `demo`.`t_demo` (`id`, `name`) VALUES ('2', '李昊');
