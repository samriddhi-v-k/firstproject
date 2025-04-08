package com.xworkz.manyavar;

import com.xworkz.manyavar.constants.Password;
import com.xworkz.manyavar.dto.ManyavarDTO;

public class ManyavarOfficial {
    public static void main(String[] args) {
        ManyavarDTO manyavarDTO  = new ManyavarDTO();
        manyavarDTO.setName("dhoni");
        manyavarDTO.setDob("15-05-2005");
        manyavarDTO.setEmail("dhoni@gmail.com");
        manyavarDTO.setPassword(Password.kidscollection);
        manyavarDTO.setPassword(Password.manyavarwomencollection);
        manyavarDTO.setConfirmPassword("kidscollection");
        manyavarDTO.setConfirmPassword("manyavarwomencollection");
    }
}
