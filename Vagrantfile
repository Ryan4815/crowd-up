# -*- mode: ruby -*-
# vi: set ft=ruby :

# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
Vagrant.configure("2") do |config|
	
	# Bring up host vm 
	config.vm.define "host" do |host|
		host.vm.box = "peru/ubuntu-18.04-desktop-amd64"
        host.vm.box_version = "20181202.01"
		host.vm.hostname = "ubuntu-host"
		host.vm.network "private_network", ip: "192.168.57.3"
		host.vm.provider "virtualbox" do |vb|
			vb.gui = true
			vb.memory = 2048
		end
	end
	
	# Set ssh forwarding
	config.ssh.forward_agent = true
	
	# Run Ansible playbook
	config.vm.provision "ansible" do |ansible|
	    ansible.playbook = "ansible-role-crowd/playbook.yml"
	end

end
