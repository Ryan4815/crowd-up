# crowd-up

Clone this repo onto a Linux VM. This will be the controll machine upon which Ansible will be installed and used to provision a second VM for Crowd.

Run "vagrant up" to create an Ubuntu 18.04 Desktop LTS Virtual Machines, for host (Crowd and Selenium installs via Ansible). 

The provisioning will run an Ansible playbook on the VM to install Atlassian Crowd, selenium  and the java development kit (JDK).

Selenium based UI tests (written in Java) can be found in the "selenium-test/crowd" folder (another example for writing selenium tests is provided in the example/ directory).

To test Atlassian Crowd with Selenium run the following: ""

-----------

ansible-role-crowd used https://github.com/mimacom/ansible-role-crowd - This role was created by Remo Wenger (mimacom) and used under Apache License 2.0.

Alternate Ansible-build role for Crowd by Wong Hoi Sing Edison at https://github.com/alvistack/ansible-role-crowd and used under Apache License 2.0

https://www.youtube.com/watch?v=cIevkkD_LB4 - Part 1 and 2 - Good Selenium Tutorial / Tips

Instructions for setting up SSH for Bitbucket and Git: https://confluence.atlassian.com/bitbucket/set-up-ssh-for-git-728138079.html
