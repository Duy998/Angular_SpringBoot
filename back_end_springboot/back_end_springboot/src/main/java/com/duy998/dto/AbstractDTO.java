package com.duy998.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AbstractDTO<T>{

    private Long id;
    private List<T> listResult = new ArrayList<>();
}
