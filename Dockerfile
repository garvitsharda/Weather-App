# Use the official Nginx image from Docker Hub as a base image
FROM nginx:alpine

# Set the working directory in the container
WORKDIR /usr/share/nginx/html

# Remove the default Nginx static files
RUN rm -rf ./*

# Copy the local HTML, CSS, and JS files to the Nginx directory
COPY . .

# Expose port 80 to allow traffic
EXPOSE 80

# No need for CMD as the Nginx base image already has the default command to start Nginx
