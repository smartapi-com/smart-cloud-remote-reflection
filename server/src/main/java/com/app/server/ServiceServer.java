package com.app.server;

import com.jk.util.reflection.server.ReflectionServer;

public class ServiceServer {
	
	public static void main(String[] args) {
		ReflectionServer server = new ReflectionServer(7125);
		server.start();
	}
}