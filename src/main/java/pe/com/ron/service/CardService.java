package pe.com.ron.service;

import lombok.AllArgsConstructor;
import pe.com.ron.persistence.dao.CardDAO;
import pe.com.ron.persistence.entity.CardEntity;

import java.sql.Connection;
import java.sql.SQLException;


@AllArgsConstructor
public class CardService {

    private final Connection connection;

    public CardEntity create(final CardEntity entity) throws SQLException {
        try {
            var dao = new CardDAO(connection);
            dao.insert(entity);
            connection.commit();
            return entity;
        } catch (SQLException ex){
            connection.rollback();
            throw ex;
        }
    }
}
