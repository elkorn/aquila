FROM ubuntu:14.04
MAINTAINER Korneliusz Caputa <helluinster@gmail.com>

ENV     OME /root

RUN     apt-get update -qq

# install ruby
RUN     apt-get install -y -qq ruby-dev
RUN     apt-get install make

# install compass
RUN     gem install --no-rdoc --no-ri compass

# install Node

# GET NODE INSTALL DEPS
RUN     apt-get install nodejs npm -y

# Install Bower
RUN     npm install -g bower karma protractor

# Intstall JFK which protractor needs to work
RUN     apt-get -y install openjdk-7-jre-headless

# Setup firefox + a display to run tests.
        
RUN     apt-get install -y x11vnc xvfb firefox
RUN     mkdir ~/.vnc
# Setup a password
RUN     x11vnc -storepasswd 1234 ~/.vnc/passwd

RUN     echo "Xvfb -ac :99 &" > ~/startXserver.sh 
RUN     chmod u+x ~/startXserver.sh

ENV     DISPLAY :99
RUN     ln -s /usr/bin/nodejs /usr/bin/node

WORKDIR /home/aquila-front
ADD     package.json /home/aquila-front/package.json
RUN     npm install

ADD     . /home/aquila-front

EXPOSE  2992:2992
EXPOSE  8080:8080
EXPOSE  80:80

CMD     ["/bin/bash"]
