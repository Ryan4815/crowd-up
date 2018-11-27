# crowd-up

Trying to install Atlassian Crowd with Ansible in a VM and testing with Selenium

See https://github.com/boxcutter/ubuntu for box images

Something like this in the Vagrant file to get a gui on the ubuntu server image?

	config.vm.provision "config" do |s|
       s.inline = "sudo apt-get update"
	   s.inline = "sudo apt-get install -y xfce4 virtualbox-guest-dkms virtualbox-guest-utils virtualbox-guest-x11"
	end	