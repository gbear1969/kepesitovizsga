package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {
    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private List<String> selectDinosByPreparedStatement(PreparedStatement stmt) {
        List<String> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) {
                result.add(rs.getString("breed"));
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot execute!", sqle);
        }
    }

    public List<String> checkOverpopulation () {
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select breed from dinosaur where actual > expected")) {
            List<String> dinos = selectDinosByPreparedStatement(stmt);
            Collections.sort(dinos);
            return dinos;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection failed!", sqle);
        }

    }


}
