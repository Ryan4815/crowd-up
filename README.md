# crowd-up

Trying to install Atlassian Crowd with Ansible in a VM and testing with Selenium

See https://github.com/boxcutter/ubuntu for box images

Something like this in the Vagrant file to get a gui on the ubuntu server image?

	config.vm.provision "config" do |s|
       s.inline = "sudo apt-get update"
	   s.inline = "sudo apt-get install -y xfce4 virtualbox-guest-dkms virtualbox-guest-utils virtualbox-guest-x11"
	end	
	
	
Ansible-build role for Crowd by Wong Hoi Sing Edison at https://github.com/alvistack/ansible-role-crowd and used under Apache License 2.0

https://www.youtube.com/watch?v=cIevkkD_LB4 - Part 1 and 2 - Good Selenium Tutorial / Tips
