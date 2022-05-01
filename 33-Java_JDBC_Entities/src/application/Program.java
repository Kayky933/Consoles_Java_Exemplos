package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Testes Selller:\n\n");
		System.out.println("=== <SELLER> Teste 1: find by id ===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);

		System.out.println("\n=== <SELLER> Teste 2: find by DdepartmentId ===");
		Department dep = new Department(2, null);

		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== <SELLER> Teste 3: find alll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		

		System.out.println("\n=== <SELLER> Teste 4: Insert ===");
		Seller newSeller = new Seller(null, "Novo Objeto", "email@teste.com", new Date(), 2000.0, dep);
		sellerDao.insert(newSeller);

		System.out.println("Novo objeto adicionado!! \nVerifique o resultado abaixo:\nId inserido = "+newSeller.getId());
		System.out.println("Objeto Inserido: \n"+newSeller.toString());
		
		System.out.println("\n=== <SELLER> Teste 5: Update ===");
		Seller updateSeller = new Seller(4, "Objeto com id 3", "email@teste2.com", new Date(), 4000.0, dep);
		seller = sellerDao.findById(updateSeller.getId());
		sellerDao.update(updateSeller);
		System.out.println("O objeto com o ID igual a "+updateSeller.getId()+" foi alterado!!\nVeja o resultado abaixo");
		
		System.out.println("Objeto antes: "+seller.toString());
		System.out.println("Ojteto após o Update: "+sellerDao.findById(updateSeller.getId()).toString());
		
		
		System.out.println("\n=== <SELLER> Teste 6: Delet ===");
		int deletId = 4;
		seller = sellerDao.findById(deletId);
		sellerDao.delet(deletId);
		System.out.println("O objeto com o ID igual a "+seller.getId()+" foi deletado!!");
		System.out.println("Objeto deletado: "+seller);
		
		
		
		System.out.println("------------------------\n Testes Department:\n\n");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("Testes <Department>:\n\n");
		System.out.println("=== <SELLER> Teste 7: find by id ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== <Department> Teste 8: find alll ===");
		List<Department> listDep = departmentDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);
		}

		System.out.println("\n=== <Department> Teste 8: Insert ===");
		Department newDepartment = new Department(null, "Novo Objeto");
		departmentDao.insert(newDepartment);

		System.out.println("Novo objeto adicionado!! \nVerifique o resultado abaixo:\nId inserido = "+newDepartment.getId());
		System.out.println("Objeto Inserido: \n"+newDepartment.toString());
		
		System.out.println("\n=== <Department> Teste 9: Update ===");
		Department updateDepartment  = new Department(3, "Objeto com id 3");
		department = departmentDao.findById(updateDepartment.getId());
		departmentDao.update(updateDepartment);
		System.out.println("O objeto com o ID igual a "+updateDepartment.getId()+" foi alterado!!\nVeja o resultado abaixo");
		
		System.out.println("Objeto antes: "+seller.toString());
		System.out.println("Ojteto após o Update: "+departmentDao.findById(updateDepartment.getId()).toString());
		
		
		System.out.println("\n=== <Department> Teste 10: Delet ===");
		department = departmentDao.findById(1);
		departmentDao.delet(1);
		System.out.println("O objeto com o ID igual a "+department.getId()+" foi deletado!!");
		System.out.println("Objeto deletado: "+department);

	}

}
