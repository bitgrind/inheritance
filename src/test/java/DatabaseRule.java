@Override
  protected void after() {
    try(Connection con = DB.sql2o.open()) {
      String deletePersonsQuery = "DELETE FROM persons *;";
      String deleteMonstersQuery = "DELETE FROM monsters *;";
      String deleteCommunitiesQuery = "DELETE FROM communities *;";
      con.createQuery(deletePersonsQuery).executeUpdate();
      con.createQuery(deleteMonstersQuery).executeUpdate();
      con.createQuery(deleteCommunitiesQuery).executeUpdate();
    }
  }
