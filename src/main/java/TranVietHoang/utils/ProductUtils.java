package TranVietHoang.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import TranVietHoang.beans.Product;

public class ProductUtils {
	//doc danh sach sp
	public static List<Product> queryProduct(Connection conn) throws SQLException{
		String sql = "Select a.CODE, a.NAME, a.PRICE from PRODUCT a";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Product> list = new ArrayList<Product>();
		
		while (rs.next()) {
			String code = rs.getString("CODE");
			String name = rs.getString("NAME");
			float price = rs.getFloat("PRICE");
			Product product = new Product();
			product.setCode(code);
			product.setName(name);
			product.setPrice(price);
			list.add(product);
		}
		return list;
	}
	 public static Product queryProductByCode(Connection conn, String productCode) throws SQLException {
	        String sql = "SELECT CODE, NAME, PRICE FROM PRODUCT WHERE CODE=?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, productCode);
	        ResultSet rs = pstm.executeQuery();

	        if (rs.next()) {
	            String code = rs.getString("CODE");
	            String name = rs.getString("NAME");
	            float price = rs.getFloat("PRICE");

	            Product product = new Product();
	            product.setCode(code);
	            product.setName(name);
	            product.setPrice(price);

	            return product;
	        }

	        return null; // Product not found
	    }
	 
	 public static void insertProduct(Connection conn, Product newProduct) throws SQLException {
	        String sql = "INSERT INTO PRODUCT (CODE, NAME, PRICE) VALUES (?, ?, ?)";
	        PreparedStatement pstm = conn.prepareStatement(sql);

	        pstm.setString(1, newProduct.getCode());
	        pstm.setString(2, newProduct.getName());
	        pstm.setFloat(3, newProduct.getPrice());

	        pstm.executeUpdate();
	    }
	 
	// Update an existing product
	    public static void updateProduct(Connection conn, Product updatedProduct) throws SQLException {
	        String sql = "UPDATE PRODUCT SET NAME=?, PRICE=? WHERE CODE=?";
	        PreparedStatement pstm = conn.prepareStatement(sql);

	        pstm.setString(1, updatedProduct.getName());
	        pstm.setFloat(2, updatedProduct.getPrice());
	        pstm.setString(3, updatedProduct.getCode());

	        pstm.executeUpdate();
	    }
	    
	 // Delete a product by code
	    public static void deleteProduct(Connection conn, String productCode) throws SQLException {
	        String sql = "DELETE FROM PRODUCT WHERE CODE=?";
	        PreparedStatement pstm = conn.prepareStatement(sql);

	        pstm.setString(1, productCode);

	        pstm.executeUpdate();
	    }
}

