package com.example.programmer.factory;

import com.example.programmer.service.impl.ProgrammerServiceImpl;

public final class ProgrammerFactory {
	
	public static ProgrammerServiceImpl getInstance() {
		return new ProgrammerServiceImpl();
	}
}
