import React from 'react'

const EmployeeList = () => {
  return (
    <div className="container mx-auto my-8">
    <div className="h-12">
         <button  className="rounded bg-slate-600 text-white px-6 py-2 font-semibold">Add Employee </button>
    </div>
    <div className="flex shadow border-b">
        <table className="min-w-full">
            <thead className="bg-gray-50">
                <tr>
                <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6"> Firt Name</th>
                <th className = "text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">Last Name</th>
                <th className="text-left font-medium text-gray-500 uppercase tracking-wider py-3 px-6">Email Id</th>
                <th className="text-right font-medium text-gray-500 uppercase tracking-wider py-3 px-6">Actions</th>
                </tr>
            </thead>
            <tbody className="bg-white">
                <tr>
                    <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">Shabbir</div>
                    </td>
                    <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">Dawoodi</div>
                    </td>
                    <td className="text-left px-6 py-4 whitespace-nowrap">
                        <div className="text-sm text-gray-500">Shabbir@gmail.com</div>
                    </td>
                    <td className="text-right px-6 py-4 whitespace-nowrap font-medium text-sm">
                        <a href="#" className="text-">Edit</a>
                        <a href="#">Delete</a>
                        </td>
                </tr>
            </tbody>
        </table>
    </div>
    </div>
  );
};

export default EmployeeList
