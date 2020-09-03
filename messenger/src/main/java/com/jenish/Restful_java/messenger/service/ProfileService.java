package com.jenish.Restful_java.messenger.service;

import java.util.Map;

import com.jenish.Restful_java.messenger.database.DatabaseClass;
import com.jenish.Restful_java.messenger.model.Profile;

public class ProfileService
{

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	
}
