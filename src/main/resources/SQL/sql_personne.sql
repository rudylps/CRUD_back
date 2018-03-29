-- -----------------------------------------------------
-- Table `GEDESAFT.V3`.`personne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GEDESAFT.V3`.`personne` (
  `id_personne` INT NOT NULL AUTO_INCREMENT,
  `nomProtagonniste` VARCHAR(20) NULL,
  `prenomProtagonniste` VARCHAR(20) NULL,
  PRIMARY KEY (`id_personne`),
  UNIQUE INDEX `id_personne_UNIQUE` (`id_personne` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Ajout de personnes dans la table `personne`
-- -----------------------------------------------------
INSERT INTO personne (nomProtagonniste, prenomProtagonniste)
VALUES 
('Pellard', 'Rudy'),
('Dethier', 'Yannick'),
('Fouchere', 'Laetitia'),
('Collet', 'Yann');