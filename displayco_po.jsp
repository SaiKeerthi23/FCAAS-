<!DOCTYPE html>
<html>
<head>
    <title>CO-PO Articulation Matrix</title>
</head>
<body>
    <h1>CO-PO Articulation Matrix</h1>
    <form action="MatrixServlet" method="post">
        <table border="1">
            <thead>
                <tr>
                    <th>CO / PO</th>
                    <!-- Add 12 PO columns -->
                    <th>PO1</th>
                    <th>PO2</th>
                    <th>PO3</th>
                    <th>PO4</th>
                    <th>PO5</th>
                    <th>PO6</th>
                    <th>PO7</th>
                    <th>PO8</th>
                    <th>PO9</th>
                    <th>PO10</th>
                    <th>PO11</th>
                    <th>PO12</th>
                    <!-- Add PSO1 and PSO2 columns -->
                    <th>PSO1</th>
                    <th>PSO2</th>
                </tr>
            </thead>
            <tbody>
                <!-- Add 5 CO rows -->
                <tr>
                    <td>CO1</td>
                    <td><input type="text" name="matrix[co1][po1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po3]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po4]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po5]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po6]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po7]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po8]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po9]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po10]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po11]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][po12]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <!-- Add input fields for PSO1 and PSO2 -->
                    <td><input type="text" name="matrix[co1][pso1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co1][pso2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                </tr>
                <tr>
                    <td>CO2</td>
                    <td><input type="text" name="matrix[co2][po1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po3]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po4]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po5]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po6]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po7]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po8]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po9]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po10]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po11]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][po12]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <!-- Add input fields for PSO1 and PSO2 -->
                    <td><input type="text" name="matrix[co2][pso1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co2][pso2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                </tr>
                <tr>
                    <td>CO3</td>
                    <td><input type="text" name="matrix[co3][po1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po3]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po4]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po5]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po6]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po7]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po8]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po9]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po10]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po11]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][po12]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <!-- Add input fields for PSO1 and PSO2 -->
                    <td><input type="text" name="matrix[co3][pso1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co3][pso2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                </tr>
                <tr>
                    <td>CO4</td>
                    <td><input type="text" name="matrix[co4][po1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po3]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po4]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po5]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po6]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po7]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po8]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po9]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po10]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po11]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][po12]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <!-- Add input fields for PSO1 and PSO2 -->
                    <td><input type="text" name="matrix[co4][pso1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co4][pso2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                </tr>
                <tr>
                    <td>CO5</td>
                    <td><input type="text" name="matrix[co5][po1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po3]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po4]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po5]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po6]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po7]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po8]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po9]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po10]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po11]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][po12]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <!-- Add input fields for PSO1 and PSO2 -->
                    <td><input type="text" name="matrix[co5][pso1]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                    <td><input type="text" name="matrix[co5][pso2]" pattern="-|[-+]?\d+(\.\d+)?" required></td>
                </tr>
               
                <!-- Repeat the same structure for the remaining COs -->
            </tbody>
        </table>
        <br>
        <input type="submit" value="           Submit          ">
    </form>
</body>
</html>
