/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Hyper10n
 * Created: May 10, 2021
 */

CREATE TABLE pet (
    PetID INTEGER PRIMARY KEY,
    Name TEXT NOT NULL,
    Species TEXT NOT NULL,
    Breed TEXT,
    Age INTEGER,
    Fixed INTEGER DEFAULT 0,
    Microchipped INTEGER DEFAULT 0,
    Description TEXT
)