FROM node:12.19.0
WORKDIR /VMS

ENV PATH /VMS/node_modules/.bin:$PATH

COPY package.json /VMS/package.json
RUN npm install
RUN npm install -g @angular/cli@10.2.3

COPY . /VMS

CMD ng serve --host 0.0.0.0