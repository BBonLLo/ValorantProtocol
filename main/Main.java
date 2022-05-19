package main;

import controlador.AgentManager;
import controlador.AgentManagerDBImplementation;
import controlador.MapManager;
import controlador.MapManagerDBImplementation;
import controlador.MissionManager;
import controlador.MissionManagerBDImplementation;
import controlador.ViewManager;
import controlador.ViewManagerImplementation;
import controlador.WeaponManager;
import controlador.WeaponManagerDBImplementation;

public class Main {

	public static void main(String[] args) {
		// Data manipulation
		MapManager map = new MapManagerDBImplementation();
		AgentManager agent = new AgentManagerDBImplementation();
		WeaponManager weapon = new WeaponManagerDBImplementation();
		MissionManager mission = new MissionManagerBDImplementation();

		// View manipulation
		ViewManager view = new ViewManagerImplementation();
		view.openView(map, agent, weapon, mission);
	}

}