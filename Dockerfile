# Use official Oracle image from DockerHub
FROM gvenzl/oracle-xe

# Expose port for OracleDB
EXPOSE 1521

# Environment variables for Oracle DB setup
ENV ORACLE_PASSWORD=adminpassword \
    ORACLE_DATABASE=usersdb

# Default CMD for the Oracle database
CMD ["start"]
