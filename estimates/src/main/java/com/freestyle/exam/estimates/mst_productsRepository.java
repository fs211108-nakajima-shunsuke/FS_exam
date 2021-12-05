// package com.freestyle.exam.estimates;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// @Repository
// public class mst_productsRepository {
//     private final JdbcTemplate jdbcTemplate;

//     @Autowired
//     public mst_productsRepository(JdbcTemplate jdbcTemplate) {
//             this.jdbcTemplate = jdbcTemplate;
//     }
    
//     public List<mst_products> getAll(){
//         String sql = "select cd, name, price";
//         List<Map<String, Object>> productsList = jdbcTemplate.queryForList(sql);
//         List<mst_products> list = new ArrayList<>();
//         for(Map<String, Object> pro : productsList){
//             mst_products product = new mst_products();
//             product.setCd((int)pro.get("cd"));
//             product.setName((String)pro.get("name"));
//             product.setPrice((int)pro.get("price"));
//             list.add(product);
//         }
//         return list;
//     }
// }
