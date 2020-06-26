package employeejdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addEmployee(Employee employee){
        String query = "insert into employee values(?,?,?)";
        return jdbcTemplate.update(query,employee.getEmployeeId(),employee.getEmployeeName(),employee.getEmployeeSalary());
//        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
//            @Override
//            public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
//                preparedStatement.setInt(1,employee.employeeId);
//                preparedStatement.setString(2,employee.employeeName);
//                preparedStatement.setInt(3,employee.employeeSalary);
//                return preparedStatement.execute();
//            }
//        });
    }

    public int deleteEmployeeById(int employeeId){
        String query = "delete from employee where employeeId=?";//+employeeId+"";
        return jdbcTemplate.update(query,employeeId);
    }

    public List<Employee> getAllEmployeesData(){
        return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getInt(1));
                employee.setEmployeeName(rs.getString(2));
                employee.setEmployeeSalary(rs.getInt(3));
                return employee;
            }
        });
//        return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
//            @Override
//            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
//                List<Employee> employeeData = new ArrayList<>();
//                while (rs.next()) {
//                    Employee employee = new Employee();
//                    employee.setEmployeeId(rs.getInt(1));
//                    employee.setEmployeeName(rs.getString(2));
//                    employee.setEmployeeSalary(rs.getInt(3));
//                    employeeData.add(employee);
//                }
//                return employeeData;
//            }
//        });
    }
}
