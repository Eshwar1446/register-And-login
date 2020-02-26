package comm.module.example.service;

import comm.module.example.dto.SignUpDTO;

public interface SignUpService {

	public boolean validateAndSave(SignUpDTO dto);
}
