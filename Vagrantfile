# -*- mode: ruby -*-
# vi: set ft=ruby :

# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
Vagrant.configure("2") do |config|

	config.vm.define "crowd" do |ctl|
		# ctl.vm.box = "ubuntu1804-0.1.0.box"
		
		ctl.vm.box = "peru/ubuntu-18.04-desktop-amd64"
        ctl.vm.box_version = "20181202.01"
		
		ctl.vm.hostname = "ubuntu-crowd"
		ctl.vm.network "private_network", ip: "192.168.57.2"
		ctl.vm.provider "virtualbox" do |vb|
			vb.gui = true
			vb.memory = 2048
		end
	end

end