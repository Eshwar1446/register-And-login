package comm.module.example.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.module.example.dao.SignUpDAO;
import comm.module.example.dto.SignUpDTO;
import comm.module.example.entity.SignUpEntity;

@Service
public class SignUpSrviceImpl implements SignUpService {
	
	@Autowired
	private SignUpDAO dao;
	
	public SignUpSrviceImpl() {
        System.out.println("created\t"+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(SignUpDTO dto) {
	System.out.println("invoked validateAndSave");
	   boolean valid = true;
	   try {
		   System.out.println("hi");
	   if (valid) {
			System.out.println("Data is valid ,will convert  to entity");

			SignUpEntity signupEntity = new SignUpEntity();

			BeanUtils.copyProperties(dto, signupEntity);

			System.out.println("entity is ready \t " + signupEntity);
			dao.save(signupEntity);
		} else {
			System.out.println("DATA NOT VALID ,NOT SAVED IN DATABASE");
		}

		return valid;
	
} catch (Exception e) {
	e.printStackTrace();
}
		return false;
	}

}
