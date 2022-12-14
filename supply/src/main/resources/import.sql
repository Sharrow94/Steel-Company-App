--fill STEEL_GRADE table
insert into STEEL_GRADE(id,din,letter_numerical_pn_en_10027_1,numercial_PN_EN_10027_2) values(1,'A10X','1.0718','96MnPB28');
insert into STEEL_GRADE(id,din,letter_numerical_pn_en_10027_1,numercial_PN_EN_10027_2) values(2,'A11','1.0721','10S20');
insert into STEEL_GRADE(id,din,letter_numerical_pn_en_10027_1,numercial_PN_EN_10027_2) values(3,'','1.0722','10SPb20');
insert into STEEL_GRADE(id,din,letter_numerical_pn_en_10027_1,numercial_PN_EN_10027_2) values(4,'30H','1.7033','34Cr4');
insert into STEEL_GRADE(id,din,letter_numerical_pn_en_10027_1,numercial_PN_EN_10027_2) values(5,'','1.0535','C55');

--fill DENSITY table
insert into DENSITY(id,DENSITY_VALUE,WEIGTH_UNIT,LENGTH_UNIT) values(1,7800.0,2,2);
insert into DENSITY(id,DENSITY_VALUE,WEIGTH_UNIT,LENGTH_UNIT) values(2,2700.0,2,2);
insert into DENSITY(id,DENSITY_VALUE,WEIGTH_UNIT,LENGTH_UNIT) values(3,8960.0,2,2);

--fill STEEL_SHEET_SIZE table
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(1,100,100,2.0,1,'100x100x2');
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(2,100,200,2.0,2,'100x200x2');
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(3,100,300,2.0,3,'100x300x2');
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(4,100,400,2.0,1,'100x400x2');
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(5,100,500,2.0,1,'100x500x2');
insert into STEEL_SHEET(id,length,width,thickness,density_id,name) values(6,100,600,2.0,1,'100x600x2');

--fill STEEL_STORAGE table
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(1,5,6,12,10);
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(2,5,5,10,5);
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(3,3,4,2,0);
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(4,1,5,10,5);
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(5,2,3,4,3);
insert into STEEL_STORAGE(id,STEEL_GRADE_ID,STEEL_SHEET_ID,STOCK_QUANTITY,MIN_STOCK_QUANTITY) values(6,4,4,10,8);




