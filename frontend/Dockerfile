# Usar la versión oficial de Node.js 18
FROM node:18-alpine AS crud-frontend

# Directorio de trabajo
WORKDIR /app

# Copiar los archivos del proyecto
COPY . .

# Instalar dependencias
RUN npm install

# Ejecutar el build
RUN npm run build --prod

# Configuración para el servidor (si es necesario)
EXPOSE 80

# Comando para ejecutar el servidor
CMD ["npm", "start"]
