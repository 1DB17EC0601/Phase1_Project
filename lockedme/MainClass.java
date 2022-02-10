package com.lockedme;

import lockedme.MenuOptions;

import lockedme.Operators;
import lockedme.Options;

public class MainClass {

			public static void main(String[] args) {
					
					// Create "main" folder if not present in current folder structure
					Operators.createMainFolderIfNotPresent("MainClass");
					
					MenuOptions.printWelcomeScreen("LockedMe", "MALLAPPA");
					
					Options.handleWelcomeScreenInput();
				}

			}



