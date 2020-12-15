package com.bbtutorials.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Vaga {
	
	@Id
	@Column
    private long id;

    @Column
    @NotNull(message="{NotNull.Vaga.latitude}")
    private String latitude;
    
    @Column
    @NotNull(message="{NotNull.Vaga.longitude}")
    private String longitude;
    
    @Column
    @NotNull(message="{NotNull.Vaga.idDispositivo}")
    private String idDispositivo;

}
