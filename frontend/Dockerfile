FROM node:18-alpine AS builder

# Directorio de trabajo
WORKDIR /app

# Copiar los archivos del proyecto
COPY . .

# Instalar dependencias
RUN npm install

# Ejecutar el build
RUN npm run build --prod

# Usar Nginx para servir la aplicación
FROM nginx:alpine

# Copiar archivos construidos desde el builder
COPY --from=builder /app/dist/frontend/browser /usr/share/nginx/html

# Exponer el puerto 80
EXPOSE 80

# Comando por defecto de Nginx
CMD ["nginx", "-g", "daemon off;"]
