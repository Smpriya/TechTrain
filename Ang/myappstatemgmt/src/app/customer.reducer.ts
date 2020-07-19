import { CustomerActionTypes, ActionEx } from "./customer.actions";

export const initialState = [];

export function CustomerReducer(state = initialState, action: ActionEx) {
    switch (action.type) {
        case CustomerActionTypes.Add:
            console.log("======+++++Added");
            return [...state, action.payload];
        case CustomerActionTypes.Remove:
            console.log("======+++++Rempoved");
            return [
                ...state.slice(0, action.payload),
                ...state.slice(action.payload + 1)
            ];
        default:
            return state;
    }
}