package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddRoleDto {
	@NotNull
	@Min(value = 1)
	private Long groupId;
	
	@NotNull
	@Min(value = 1)
	private Long roleId;
}
