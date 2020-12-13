package collections;

import java.util.HashSet;
import java.util.Set;

public class StreamSetWithFlatMapSupportClass {
	
	private String name;
	private Set<String> devices;
	
//	public StreamSetWithFlatMapSupportClass(String name, Set<String> devices) {
//		super();
//		this.name = name;
//		this.devices = devices;
//	}
//	
	public void addDevice(String deviceName){
		if(devices==null)
			this.devices = new HashSet<>();
		this.devices.add(deviceName);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return this.devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

}
