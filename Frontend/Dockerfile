FROM nginx:1.27.2-alpine

RUN rm usr/share/nginx/html/50x.html

COPY build /usr/share/nginx/html

EXPOSE 80