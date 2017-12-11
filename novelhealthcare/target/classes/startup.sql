
INSERT INTO `novelhealthcare_db`.`address`(address_id,address1,address2,city,state,zipcode) VALUES (1,"doorno:3-12","ameerpet","hyderabad","telangana",500072);
INSERT INTO `novelhealthcare_db`.`user_profile`(`full_name`,`user_name`,`password`,`phone_no`,`email`,`gender`,`status`,`no_of_attempts`,`address_id_fk`) VALUES ('ramesh pamidi','superadmin','12345',9959890915,'superadmin@gmail.com','male',1,0,1);


INSERT INTO `novelhealthcare_db`.`role` (`role_id`,`role_name`) VALUES ('1','superadmin');
INSERT INTO `novelhealthcare_db`.`role` (`role_id`,`role_name`) VALUES ('2','admin');
INSERT INTO `novelhealthcare_db`.`role` (`role_id`,`role_name`) VALUES ('3','doctor');
INSERT INTO `novelhealthcare_db`.`role` (`role_id`,`role_name`) VALUES ('4','patient');

INSERT INTO `novelhealthcare_db`.`module`  (`module_id`,`module_name`) VALUES ('1','superadmin');
INSERT INTO `novelhealthcare_db`.`module`  (`module_id`,`module_name`) VALUES ('2','admin');
INSERT INTO `novelhealthcare_db`.`module`  (`module_id`,`module_name`) VALUES ('3','doctor');
INSERT INTO `novelhealthcare_db`.`module`  (`module_id`,`module_name`) VALUES ('4','patient');


INSERT INTO `novelhealthcare_db`.`permission` (`per_id`,`per_name`) VALUES ('1','add');
INSERT INTO `novelhealthcare_db`.`permission` (`per_id`,`per_name`) VALUES ('2','update');
INSERT INTO `novelhealthcare_db`.`permission` (`per_id`,`per_name`) VALUES ('3','delete');
INSERT INTO `novelhealthcare_db`.`permission` (`per_id`,`per_name`) VALUES ('4','getall');

INSERT INTO `novelhealthcare_db`.`user_role`(`user_id_fk`,`role_id_fk`) VALUES ('1','1');

INSERT INTO `novelhealthcare_db`.`role_module` (`role_id_fk`,`module_id_fk`) VALUES ('1','1');
INSERT INTO `novelhealthcare_db`.`role_module` (`role_id_fk`,`module_id_fk`) VALUES ('2','2');
INSERT INTO `novelhealthcare_db`.`role_module` (`role_id_fk`,`module_id_fk`) VALUES ('3','3');
INSERT INTO `novelhealthcare_db`.`role_module` (`role_id_fk`,`module_id_fk`) VALUES ('4','4');

INSERT INTO `novelhealthcare_db`.`module_permission` (`module_id_fk`,`per_id_fk`) VALUES ('1','1');
INSERT INTO `novelhealthcare_db`.`module_permission` (`module_id_fk`,`per_id_fk`) VALUES ('1','2');
INSERT INTO `novelhealthcare_db`.`module_permission` (`module_id_fk`,`per_id_fk`) VALUES ('1','3');
INSERT INTO `novelhealthcare_db`.`module_permission` (`module_id_fk`,`per_id_fk`) VALUES ('1','4');
