public HashMap<Integer, String> obtenerHash() {
    // Crear un Set para almacenar los elementos únicos y eliminar duplicados
    Set<String> uniqueTransport = new HashSet<>();

    // Agregar elementos de cars
    for (String car : cars) {
        if (car != null && !car.isEmpty()) {
            uniqueTransport.add(car);
        }
    }

    // Agregar elementos de bikes
    for (String bike : bikes) {
        if (bike != null && !bike.isEmpty()) {
            uniqueTransport.add(bike);
        }
    }

    // Agregar elementos de bicicles
    for (String bicicle : bicicles) {
        if (bicicle != null && !bicicle.isEmpty()) {
            uniqueTransport.add(bicicle);
        }
    }

    // Crear el HashMap para almacenar los resultados con un índice incremental
    HashMap<Integer, String> resultMap = new HashMap<>();
    int index = 1;

    // Rellenar el HashMap con los elementos del Set único
    for (String transportItem : uniqueTransport) {
        resultMap.put(index++, transportItem);
    }

    return resultMap;
}
